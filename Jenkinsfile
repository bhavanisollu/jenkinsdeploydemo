pipeline{
    agent any
    tools {
        maven 'MyMaven'
    }
    stages {
        stage('Build Maven') {
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/bhavanisollu/jenkinsdeploydemo.git']]])

                sh "mvn -Dmaven.test.failure.ignore=true clean package"
                
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                  sh 'docker build -t bhavani005/sampleHelloWorld .'
                }
            }
        }
        stage('Deploy Docker Image') {
            steps {
                script {
                 withCredentials([string(credentialsId: 'bhavani005', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u bhavani005 -p ${dockerhubpwd}'
                 }  
                 sh 'docker push bhavani005/sampleHelloWorld'
                }
            }
        }
    }
}
