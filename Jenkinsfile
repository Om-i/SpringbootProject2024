pipeline {
    agent any
//    environment {
//        JAVA_HOME = "/usr/lib/jvm/java-21-openjdk-amd64"
//        PATH = "${JAVA_HOME}/bin:${env.PATH}"
//    }

    stages {
        stage('GetProject') {
            steps {
                git 'https://github.com/Om-i/SpringbootProject2024.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean:clean'
                sh 'mvn compiler:compile'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
        stage('Run') {
            steps {
//                sh 'mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8090"'
                sh 'java -jar ./target/ct5171_springBooot.jar'
            }
        }
    }
}
