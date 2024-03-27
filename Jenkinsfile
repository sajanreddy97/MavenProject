pipeline {
    agent any
    stages {
        stage ("clean stage") {
            steps {
                bat "mvn clean"
            }
        }
        stage ("test stage") {
            steps {
                bat "mvn test"
            }
        }
        stage ("package stage") {
            steps {
                bat "mvn package"
            }
        }
    }
}