#!groovy

pipeline {

    agent {
        docker {
            image 'maven:3-alpine'
            args '-v $HOME/.m2:/root/.m2'
        }
    }

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