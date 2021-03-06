pipeline{
    agent any
    tools {
        maven 'MyMaven'
    }
    stages {
        stage('Build Maven') {
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/bhavanisollu/jenkinsdeploydemo.git']]])

                bat "mvn -Dmaven.test.failure.ignore=true clean package"
                
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                  bat 'docker build -t bhavani005/sample-hello-world .'
                }
            }
        }
        stage('Deploy Docker Image') {
            steps {
                script {
                 withCredentials([string(credentialsId: 'bhavani005', variable: 'dokerhubcred')]) {
                    bat "docker login -u bhavani005 -p ${dokerhubcred}"
                 }  
                 bat 'docker push bhavani005/sample-hello-world'
                }
            }
        }
        stage('Deploy to kubernetes'){
            steps{
                sshagent(['jenkins-build-pipeline-ssh-key']) {
                    bat "scp -o StrictHostKeyChecking=no deploymentAndService.yaml ec2-user@3.108.226.36:home/ec2-user/"
                }
                script{
                    try{
                        bat "ssh ec2-user@3.108.226.36 kubectl apply -f ."
                    }
                    catch(error){
                        bat "ssh ec2-user@3.108.226.36 kubectl create -f ."
                    }
                    
                    
                    // kubernetesDeploy(configs:"deploymentAndService.yaml" , kubeconfigId : "jenkins-deploy-kubernetes-id")
                    /*
                    try{
                    bat 'kubectl apply -f deploymentAndService.yaml --validate=false'
                    }
                    catch(error){
                    bat 'kubectl create -f deploymentAndService.yaml --validate=false'
                    }
                    */
                    
                }
            }
        }
    }
}
