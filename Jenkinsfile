pipeline {
  agent {
    docker {
      image '6725c742302bcab9f00f4b42db08214f7e93f7ca534ab4a7dd1ecc4ac7d9dcd6'
      args 'run'
    }

  }
  stages {
    stage('Build') {
      steps {
        build 'dsn'
      }
    }
  }
}