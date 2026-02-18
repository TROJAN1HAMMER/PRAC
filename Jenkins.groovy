pipeline{
    agent any
    
    stages{
        stage('A'){
            step{
                echo 'A0'
            }
        }
        stage('B'){
            step{
                echo 'B0'
            }
        }
        stage('C'){
            step{
                echo 'C0'
            }
        }
    }
}