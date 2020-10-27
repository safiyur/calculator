pipeline {
    agent any
    stages {
        stage("Compile") {
            steps {
                bat "./gradlew compileJava"
            }
        }

        stage("Package") {
            steps {
                bat "./gradlew build"
            }
            }

        stage("Docker build") {
            steps {
                bat "docker build -t safik1/calculator ."
            }
            }
}
}