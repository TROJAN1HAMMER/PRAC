pipeline{
    agent any
    
    stages{
        stage('A'){
            steps{
                echo 'A0'
            }
        }
        stage('B'){
            steps{
                echo 'B0'
            }
        }
        stage('C'){
            steps{
                echo 'C0'
            }
        }
    }
}