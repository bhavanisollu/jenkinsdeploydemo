
pipeline{
    agent any
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
