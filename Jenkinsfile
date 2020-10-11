pipeline {
    agent any
	tools {
        maven 'maven3.6.3'
        jdk 'Java8'
    }
    stages {
        stage ('Initialize') {
            steps {
                bat '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage('Build with unit testing') {
            steps {
				bat 'mvn clean install'
            }
        }
        stage('Release to Dev') {
            steps {
        		echo "release to dev"
            }
        }
        stage('Release to Staging') {
            steps {
                echo "release to staging"
            }
        }
        stage('Release to Prod') {
            steps {
                echo "cf push"
            }
        }
    }
}
