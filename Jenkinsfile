#!groovy

pipeline {

    agent none

    ws("/tmp") {
        stage('checkout') {
            echo 'Checking out scm'
            checkout scm
        }

        stage('build') {
            echo 'Building project'
            sh './mvnw install'
        }

        stage('test') {
            echo 'Testing'
            sh './mvnw test'
        }

        stage('package') {
            echo 'Packaging'
            sh './mvnw package'
        }

        stage('cleanup') {
            echo 'Done'
        }
    }


}