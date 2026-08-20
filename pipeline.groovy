pipeline {
    agent any

    stages {
        stage('pull the code') {
            steps {
                git branch: 'devops', url: 'https://github.com/alkesh-007/EasyCRUD.git'
            }
        }
        stage('build') {
            steps {
                sh '''cd backend
                mvn clean package -DskipTests'''
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}