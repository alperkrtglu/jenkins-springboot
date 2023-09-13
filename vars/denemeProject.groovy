def call(Map config = [:]) {
        sh "echo ${config.isim}"

        if (config.isim == 'ALPER') {
                sh "echo ${config.isim} OLDU GALIBA"
        }
}