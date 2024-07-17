pipeline {
    agent {
        label ''
    }
    tools {
        maven "MAVEN"
    }
    environment {
        BRANCH = ""
        TEST_TAG = ""
    }
    stages {

        stage('[GITHUB - Check]') {
            steps {
                git branch: "${BRANCH}", credentialsId: '', url: ''
            }
        }

        stage('Execucao') {
            steps {
                bat "mvn test -Dcucumber.filter.tags=${TEST_TAG}"
            }
        }

    }
}