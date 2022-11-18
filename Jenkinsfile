pipeline {
    agent any
    tools {
        maven '3.8.6'
    }
    stages{
        stage('Maven Build'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/abhayshitole/address-validation']]])
                bat 'mvn clean install'
            }
        }
        stage('Build Image'){
            steps{
                script{
                    bat 'docker build -t abhayshitole/devops-image .'
                }
            }
        }
        stage('Push Image to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                        bat 'docker login -u abhayshitole -p gi@ntSound75'
                        bat 'docker push abhayshitole/devops-image'
                      }

                }
            }
        }
    }
}