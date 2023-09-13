def call(Map config = [:]) {
        if (config.isim == 'ALPER') {
                sh 'echo ${config.isim} OLDU GALIBA'
        }
}