pipeline {

    agent any
    tools {
        maven 'maven_3.6.3'
    }
    stages {
        stage('Compile stage') {
            steps {
                sh "mvn clean compile"
        }
    }

         stage('testing stage') {
             steps {
                sh "mvn test"
        }
    }

          
    }

  }

}
