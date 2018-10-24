pipeline {
  agent {
    docker {
      image 'openjdk:8-jdk-alpine'
    }

  }
  stages {
    stage('Test') {
      steps {
        sh './gradlew build --stacktrace'
      }
    }
  }
}