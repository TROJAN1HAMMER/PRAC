pipeline{
    agent any
    
    stages{
        stage('Build'){
            steps{
                echo 'A0'
            }
        }
        stage('Test'){
            steps{
                echo 'B0'
            }
        }
        stage('Deploy'){
            steps{
                echo 'C0'
            }
        }
    }
}