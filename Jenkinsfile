pipeline {

    agent any
    tools {
        maven 'maven_3.6.3'
    }
    stages {
        stage('Compile stage') {
            steps {
                withMaven "mvn clean compile"
        }
    }

         stage('testing stage') {
             steps {
                withMaven "mvn test"
        }
    }

          stage('deployment stage') {
              steps {
                withMaven "mvn deploy"
        }
    }

  }

}