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
                  bat 'docker build -t bhavani005/sampleHelloWorld .'
                }
            }
        }
        stage('Deploy Docker Image') {
            steps {
                script {
                 withCredentials([string(credentialsId: 'bhavani005', variable: 'dockerhubpwd')]) {
                    bat 'docker login -u bhavani005 -p ${dockerhubpwd}'
                 }  
                 bat 'docker push bhavani005/sampleHelloWorld'
                }
            }
        }
    }
}
