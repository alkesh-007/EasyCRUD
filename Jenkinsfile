pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh '''docker-compose build --no-cache 
                '''
            }
        }
        stage('start') {
            steps {
                sh '''docker-compose up -d
                '''
            }
        }
        stage('list-containers') {
            steps {
                sh '''docker-compose ps
                '''
            }
        }
    }
}