    public class Main {
        public static void main(String[] args) {


            // basico da tv
            SmartTv SmartTv = new SmartTv();

            System.out.println("Tv ligada? " + SmartTv.ligada);
            System.out.println("Canal em tela: " + SmartTv.canal);
            System.out.println("Volume atual: " + SmartTv.volume);

            SmartTv.ligar();
            System.out.println("Tv ligada? " + SmartTv.ligada);

            SmartTv.aumentarVolume();
            System.out.println("Volume: " + SmartTv.volume);

            SmartTv.abaixarVolume();
            System.out.println("Volume: " + SmartTv.volume);

            SmartTv.aumentarCanal();
            System.out.println("Canal: " + SmartTv.canal);

            SmartTv.mudarCanal(13);
            System.out.println("Canal alterado para: " + SmartTv.canal);

            // funcoes de tv normal
            CanalTV[] canaisTV = {
                    new CanalTV("Canal 1", "Entretenimento"),
                    new CanalTV("Canal 2", "Filmes"),
                    new CanalTV("Canal 3", "Notícias"),
                    new CanalTV("Canal 4", "Esportes"),
                    new CanalTV("Canal 5", "Documentários")
            };


            System.out.println("Canal escolhido: " + canaisTV[1].categoria);


            // funcoes de tv smart
            FuncoesSmart[] funcoesSmart = {
                    new FuncoesSmart("Netflix", "Plataforma de streaming de filmes e séries"),
                    new FuncoesSmart("YouTube", "Plataforma de compartilhamento de vídeos"),
                    new FuncoesSmart("HBO MAX", "Plataforma de streaming da Amazon da HBO"),
                    new FuncoesSmart("Amazon Prime", "Plataforma de streaming da Amazon"),
                    new FuncoesSmart("Google", "Motor de busca e serviços online"),
                    new FuncoesSmart("Músicas", "Plataforma de músicas em streaming"),
                    new FuncoesSmart("Vídeos", "Plataforma de vídeos"),


            };

            System.out.println("Função escolhida: " + funcoesSmart[0].nome + ": " + funcoesSmart[0].descricao);
            System.out.println("Função alterada para: " + funcoesSmart[1].nome + ": " + funcoesSmart[1].descricao);










        }
    }