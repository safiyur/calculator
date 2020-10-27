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

        stage("Docker Push") {
                    steps {
                        bat "docker login -u safik1 -p Safrah@165"
                        bat "docker push safik1/calculator"
                    }
                    }
}
}