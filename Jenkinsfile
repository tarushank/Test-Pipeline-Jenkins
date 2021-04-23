pipeline {
    agent any

    stages {

        stage('Compile Stage') {
            steps {
                withMaven(maven: 'maven_3.6.3') {
                    sh 'mvn clean build'
                }
            }
        }

        stage('Deployment Stage') {
            steps {
                withMaven(maven: 'maven_3.6.3') {
                    sh 'mvn deploy'
                }
            }
        }

    }
}