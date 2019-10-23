#!groovy

pipeline {

    agent any

    stages {
        stage('checkout') {
            steps {
                echo 'Checking out scm'
                checkout scm
            }

        }

        stage('build') {
            steps {
                echo 'Building project'
                sh './mvnw install'
            }
        }

        stage('test') {
            steps {
                echo 'Testing'
                sh './mvnw test'
            }

        }

        stage('package') {
            steps {
                echo 'Packaging'
                sh './mvnw package'
            }
        }

        stage('cleanup') {
            steps {
                echo 'Done'
            }

        }
    }

}