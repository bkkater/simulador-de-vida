package simulador.de.vida;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class FemFrame extends javax.swing.JFrame {

    static void enviaImagem(ImageForm aThis, String imagemSelected) {
        imagem = imagemSelected;
    }
    private String name;
    private String trabalho;
    private String genero;
    private int dinheiro;

    private int energia;
    private int fome;
    private int sede;
    private int estoqueDeComida;
    private int count = 0;
    private float precoLeite = 1f;
    private int dia;
    private String doguinhoName;
    public String input1String;
    private boolean doguinho;
    public Object[] itens = {"MACHO", "FÊMEA"};
    public Object[] itens2 = {"Sistemas de Informação", "Engenharia da Computação", "Design de Jogos"}; 
    public Object[] itens3 = {"Vem sempre aqui?", "Você é o ovo que falta na minha marmita", "Eu não sou corona, mas você quer ter um caso confirmado comigo?",
    "Papo de urubu, pena de galinha, se você vai me dar um fora, dê uma risadinha", };
    public int contadorJogo=0;
    private boolean formado;
    private String periodo;
    private int periodoNum;
    private String status;
    private String curso;
    private String statusS;
    private String namorada1;
    private int experiencia;
    private boolean presidente;
    private boolean namorada;
    private boolean atletica;
    public static String imagem;
    
        
    public FemFrame() {
        initComponents();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("playstation.png")));
        this.setTitle("Simulador de uma Vida Medíocre");
        
        this.setTrabalho("Nenhum");
        this.setDinheiro(0);
        this.setEnergia (10);
        this.setFome (0);
        this.setSede (0);
        this.setEstoqueDeComida (20);
        this.setDia (1);
        this.setDoguinho(false);
        this.setPeriodoNum(0);
        this.setPeriodo("");
        this.setStatus("Desconhecido");
        this.setCurso("Nenhum");   
        this.setExperiencia(0);
        this.setStatusS("Solteira");
        this.setPresidente(false);
        this.setAtletica(false);
       
        this.setGenero("Feminino");
        
        
        atualizarJanela();
        
        this.setResizable(false);
        jPanel3.setVisible(false);
        jPanel18.setVisible(false);
        jPanel14.setVisible(false);
        jLabel20.setVisible(false);
        jLabel27.setVisible(false);
        jLabel28.setVisible(false);
        jPanel24.setVisible(false);
        
        if(null != imagem)switch (imagem) {
            case "Imagem1":
                jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\simulador-de-vida\\simulador-de-vida\\src\\Icons\\Mulher1.png"));
                break;
            case "Imagem2":
                jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\simulador-de-vida\\simulador-de-vida\\src\\Icons\\Mulher2.png"));
                break;
            case "Imagem3":
                jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\simulador-de-vida\\simulador-de-vida\\src\\Icons\\Mulher3.png"));
                break;
            case "Imagem4":
                jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\simulador-de-vida\\simulador-de-vida\\src\\Icons\\Mulher4.png"));
                break;
            default:
                break;
        }
    }
     public void enviaNome2(Simulador nS, String nomeS){
        this.setName(nomeS);
        NameLabel.setText(getName());
    }
    
    public void atualizarJanela(){
        if(getEnergia()<=0){
           JOptionPane.showMessageDialog(null, "Você caiu no sono.\n[Fome+2] [Sede+2]", "Mensagem", JOptionPane.ERROR_MESSAGE);
           setFome(getFome()+2);
           setSede(getSede()+2);
           verificarMorte();
       }
       if(this.isPresidente()){
           jLabel27.setVisible(true);
           jLabel28.setVisible(true);
       }
       
        NameLabel.setText(getName());
        GeneroLabel.setText(getGenero());
        DinheiroLabel.setText(String.valueOf(getDinheiro()));
        TrabalhoLabel.setText(getTrabalho());
        FomeLabel.setText(String.valueOf(getFome()) + "/10");
        SedeLabel.setText(String.valueOf(getSede()) + "/10");
        EnergiaLabel.setText(String.valueOf(getEnergia()) + "/10");
        EstoqueLabel.setText(String.valueOf(getEstoqueDeComida()) + "/20");
        DiaLabel.setText(String.valueOf(getDia()));
        PeriodoLabel.setText(getPeriodo());
        StatusLabel.setText(getStatus());
        CursoLabel.setText(getCurso());
        PeriodoLabel.setText(getPeriodoNum()+ "/8");
        Status2Label.setText(getStatusS());
    }
    
    public void verificarMorte(){
       if(this.getFome()==10 || this.getSede()==10){
            JOptionPane.showMessageDialog(null, "Você morreu :(  \nTururu", "GAME OVER", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        else if(TedioProgressBar.getValue() == 100){
            JOptionPane.showMessageDialog(null, "Você está com tédio. Tente se divertir em casa.\n", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getDoguinhoName() {
        return doguinhoName;
    }

    public void setDoguinhoName(String doguinhoName) {
        this.doguinhoName = doguinhoName;
    }

    public boolean isDoguinho() {
        return doguinho;
    }

    public void setDoguinho(boolean doguinho) {
        this.doguinho = doguinho;
    }

    public boolean isFormado() {
        return formado;
    }

    public void setFormado(boolean formado) {
        this.formado = formado;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getPeriodoNum() {
        return periodoNum;
    }

    public void setPeriodoNum(int periodoNum) {
        this.periodoNum = periodoNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusS() {
        return statusS;
    }

    public void setStatusS(String statusS) {
        this.statusS = statusS;
    }

    public String getNamorada1() {
        return namorada1;
    }

    public void setNamorada1(String namorada1) {
        this.namorada1 = namorada1;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public boolean isPresidente() {
        return presidente;
    }

    public void setPresidente(boolean presidente) {
        this.presidente = presidente;
    }

    public boolean isNamorada() {
        return namorada;
    }

    public void setNamorada(boolean namorada) {
        this.namorada = namorada;
    }

    public boolean isAtletica() {
        return atletica;
    }

    public void setAtletica(boolean atletica) {
        this.atletica = atletica;
    }
    
    
    private Simulador nomeSimulador;
 
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getSede() {
        return sede;
    }

    public void setSede(int sede) {
        this.sede = sede;
    }
    
    public int getEstoqueDeComida() {
        return estoqueDeComida;
    }

    public void setEstoqueDeComida(int estoqueDeComida) {
        this.estoqueDeComida = estoqueDeComida;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        EnergiaLabel = new javax.swing.JLabel();
        FomeLabel = new javax.swing.JLabel();
        SedeLabel = new javax.swing.JLabel();
        EstoqueLabel = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        DiaLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        InformationLabel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        GeneroLabel = new javax.swing.JLabel();
        DinheiroLabel = new javax.swing.JLabel();
        TrabalhoLabel = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Status2Label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        DoguinhoLabel = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        TedioProgressBar = new javax.swing.JProgressBar();
        jLabel21 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabe26 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        ForcaProgressBar = new javax.swing.JProgressBar();
        jLabel23 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        MarceleProgressBar = new javax.swing.JProgressBar();
        jLabel30 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        PeriodoLabel = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        CursoLabel = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        FamaProgressBar = new javax.swing.JProgressBar();
        jButton18 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ProgressoProgressBar = new javax.swing.JProgressBar();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel11.setText("Energia: ");

        jLabel12.setText("Fome:");

        jLabel13.setText("Sede:");

        jLabel19.setText("Estoque de Comida:");

        EstoqueLabel.setText("asdads");

        jLabel25.setText("Dia: ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DiaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EnergiaLabel))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SedeLabel))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FomeLabel))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EstoqueLabel)))
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(DiaLabel))
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(EnergiaLabel))
                .addGap(60, 60, 60)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(FomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(SedeLabel))
                .addGap(73, 73, 73)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(EstoqueLabel))
                .addGap(95, 95, 95))
        );

        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        InformationLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("Nome:");

        jLabel15.setText("Sexo:");

        jLabel16.setText("Dinheiro:");

        jLabel17.setText("Trabalho:");

        jLabel18.setText("Informações");

        jLabel24.setText("Status:");

        javax.swing.GroupLayout InformationLabelLayout = new javax.swing.GroupLayout(InformationLabel);
        InformationLabel.setLayout(InformationLabelLayout);
        InformationLabelLayout.setHorizontalGroup(
            InformationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformationLabelLayout.createSequentialGroup()
                .addGroup(InformationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InformationLabelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(InformationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InformationLabelLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(12, 12, 12)
                                .addComponent(NameLabel))
                            .addGroup(InformationLabelLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(12, 12, 12)
                                .addComponent(GeneroLabel))
                            .addGroup(InformationLabelLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DinheiroLabel))
                            .addGroup(InformationLabelLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TrabalhoLabel))))
                    .addGroup(InformationLabelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel18))
                    .addGroup(InformationLabelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Status2Label)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        InformationLabelLayout.setVerticalGroup(
            InformationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformationLabelLayout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(29, 29, 29)
                .addGroup(InformationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(NameLabel))
                .addGap(18, 18, 18)
                .addGroup(InformationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(GeneroLabel))
                .addGap(18, 18, 18)
                .addGroup(InformationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(DinheiroLabel))
                .addGap(18, 18, 18)
                .addGroup(InformationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(TrabalhoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InformationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(Status2Label))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Personagem", jPanel1);

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton19.setText("Brincar");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("Levar pra Passear");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        DoguinhoLabel.setText("Doguinho");

        jButton30.setText("Fazer Carinho");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(DoguinhoLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(DoguinhoLabel)
                .addGap(18, 18, 18)
                .addComponent(jButton19)
                .addGap(28, 28, 28)
                .addComponent(jButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton30)
                .addGap(24, 24, 24))
        );

        TedioProgressBar.setStringPainted(true);

        jLabel21.setText("Tédio");

        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton28.setText("Assistir um Filme");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("Chamar pra Sair");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jLabe26.setText("Namorado");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabe26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabe26)
                .addGap(31, 31, 31)
                .addComponent(jButton28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton29)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton7.setText("Jogar Lolzinho");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton2.setText("Dormir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Comer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Beber Água");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(TedioProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(89, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(66, 66, 66))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(TedioProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Casa", jPanel2);

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton4.setText("Riot Games");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Pedir Emprego");

        jButton8.setText("Supermercado Tá Barato");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Mecânica do Luiz");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Lanchonete do Seu Zé");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton26.setText("Estágio");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel6))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jButton26)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(39, 39, 39))
        );

        jButton11.setText("Trabalhar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jButton11)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(408, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(68, 68, 68))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 47, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 47, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Trabalho", jPanel8);

        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton5.setText("Comprar Comida");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Fazer um Lanche");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton12.setText("Preço do Leite");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(45, 45, 45)
                .addComponent(jButton12)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 60, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 61, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(81, 81, 81)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 15, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 14, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Supermercado", jPanel9);

        ForcaProgressBar.setStringPainted(true);

        jLabel23.setText("Força");

        jPanel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton15.setText("Malhar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Comprar Whey");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Cantar os Garotinhos");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton15)
                .addGap(45, 45, 45)
                .addComponent(jButton16)
                .addGap(45, 45, 45)
                .addComponent(jButton17)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel31.setText("Bruno");

        MarceleProgressBar.setStringPainted(true);

        jLabel30.setText("Relacionamento:");

        jButton31.setText("Mandar uma Cantada");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setText("Convidar pra Jantar");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MarceleProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel31)
                                .addComponent(jLabel30)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jLabel31)
                .addGap(26, 26, 26)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MarceleProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel29))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ForcaProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addGap(0, 14, Short.MAX_VALUE)))))
                .addGap(51, 51, 51))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ForcaProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Academia", jPanel5);

        jLabel39.setText("Período: ");

        PeriodoLabel.setText("asd");

        jLabel40.setText("Status:");

        StatusLabel.setText("asd");

        jLabel41.setText("Curso:");

        CursoLabel.setText("ads");

        jButton25.setText("Procurar Faculdade");
        jButton25.setMaximumSize(new java.awt.Dimension(151, 32));
        jButton25.setMinimumSize(new java.awt.Dimension(151, 32));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton13.setText("Estudar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Jogar um RPG");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton21.setText("Tocar um Violão");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("Jogar Bola");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addGap(18, 18, 18)
                .addComponent(jButton21)
                .addGap(18, 18, 18)
                .addComponent(jButton22)
                .addGap(16, 16, 16))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel22.setText("Fama");

        jButton24.setText("Cantar os Garotinhos");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton23.setText("Ir na Festinha");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        FamaProgressBar.setStringPainted(true);

        jButton18.setText("Participar da Atlética");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton27.setText("Virar Presidenta");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FamaProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jButton18)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FamaProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Progresso do Período:");

        ProgressoProgressBar.setStringPainted(true);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProgressoProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProgressoProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel28.setText("Presidente da Atlética");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PeriodoLabel))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CursoLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel38)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StatusLabel)))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel28))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 120, Short.MAX_VALUE))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CursoLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel39)
                                    .addComponent(PeriodoLabel)))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel27))))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(StatusLabel))
                        .addGap(27, 27, 27)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Faculdade", jPanel16);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        verificarMorte();
        if(!this.isDoguinho()){
            int resposta = JOptionPane.showConfirmDialog(null,"Deseja adotar um doguinho?","Adoção",JOptionPane.YES_NO_OPTION);

            if(resposta == JOptionPane.YES_OPTION){
                input1String =  JOptionPane.showInputDialog("Insira o nome do Doguinho");
                setDoguinhoName(input1String);
                setDoguinho(true);

                Object selectedValue = JOptionPane.showInputDialog(null, "Escolha: ", "Opção",JOptionPane.INFORMATION_MESSAGE, null,itens, itens [0]);

                JOptionPane.showMessageDialog(null, "Você brincou com " + getDoguinhoName() + " e seu tédio diminuiu. \n[Tédio-10]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                TedioProgressBar.setValue(TedioProgressBar.getValue()-10);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Você brincou com " + getDoguinhoName() + " e seu tédio diminuiu. \n[Tédio-10]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            TedioProgressBar.setValue(TedioProgressBar.getValue()-10);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        verificarMorte();
        if(!this.isDoguinho()){
            int resposta = JOptionPane.showConfirmDialog(null,"Deseja adotar um doguinho?","Adoção",JOptionPane.YES_NO_OPTION);

            if(resposta == JOptionPane.YES_OPTION){
                input1String =  JOptionPane.showInputDialog("Insira o nome do Doguinho");
                setDoguinhoName(input1String);
                setDoguinho(true);

                Object selectedValue = JOptionPane.showInputDialog(null, "Escolha: ", "Opção",JOptionPane.INFORMATION_MESSAGE, null,itens, itens [0]);

                JOptionPane.showMessageDialog(null, "Você levou  " + getDoguinhoName() + " pra passear e seu tédio diminuiu. \n[Tédio-10]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                TedioProgressBar.setValue(TedioProgressBar.getValue()-10);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Você levou " + getDoguinhoName() + " pra passear e seu tédio diminuiu. \n[Tédio-10]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            TedioProgressBar.setValue(TedioProgressBar.getValue()-10);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        verificarMorte();
        if(!this.isDoguinho()){
            int resposta = JOptionPane.showConfirmDialog(null,"Deseja adotar um doguinho?","Adoção",JOptionPane.YES_NO_OPTION);

            if(resposta == JOptionPane.YES_OPTION){
                input1String =  JOptionPane.showInputDialog("Insira o nome do Doguinho");
                setDoguinhoName(input1String);
                setDoguinho(true);

                Object selectedValue = JOptionPane.showInputDialog(null, "Escolha: ", "Opção",JOptionPane.INFORMATION_MESSAGE, null,itens, itens [0]);

                JOptionPane.showMessageDialog(null,getDoguinhoName() + " recebeu um bom carinho. \n[Tédio-10]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                TedioProgressBar.setValue(TedioProgressBar.getValue()-10);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, getDoguinhoName() + " recebeu um bom carinho. \n[Tédio-10]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            TedioProgressBar.setValue(TedioProgressBar.getValue()-10);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        verificarMorte();
        if(!this.isNamorada()){
            JOptionPane.showMessageDialog(null,"Você não tem um namorado!\nTururu", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Você passou um bom tempo com o " + getNamorada1() + ".\n [Tédio-5]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            TedioProgressBar.setValue(TedioProgressBar.getValue()-5);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        verificarMorte();
        if(!this.isNamorada()){
            JOptionPane.showMessageDialog(null,"Você não tem um namorado!\nTururu", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Você leva " + getNamorada1() + " pra um passeio e se divertem muito.\n [Tédio-5]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            TedioProgressBar.setValue(TedioProgressBar.getValue()-5);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        verificarMorte();

        contadorJogo++;

        if(contadorJogo<10){
            JOptionPane.showMessageDialog(null, "Você jogou seu Lolzinho e seu tédio diminuiu. \n[Tédio -10]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            TedioProgressBar.setValue(TedioProgressBar.getValue()-10);
        }
        else if(contadorJogo == 10){
            int resposta1 = JOptionPane.showConfirmDialog(null,"Twitch te oferece o emprego de Streamer de Lol\n \nAceita a Oferta?","Oferta de Emprego",JOptionPane.YES_NO_OPTION);
            if(resposta1 == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Você foi contratado!", "Parabéns", JOptionPane.INFORMATION_MESSAGE);
                this.setTrabalho("Streamer de Lol");
            }
            if(contadorJogo >10){
                JOptionPane.showMessageDialog(null, "Você jogou seu Lolzinho e seu tédio diminuiu. \n[Tédio -10]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                TedioProgressBar.setValue(TedioProgressBar.getValue()-10);
            }

        }

        atualizarJanela();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        verificarMorte();

        if(this.getEnergia()==10){
            JOptionPane.showMessageDialog(null, "Você não está com sono", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        else{
            this.setEnergia(10);
            this.setFome(this.getFome()+1);
            this.setSede(this.getSede()+1);
            JOptionPane.showMessageDialog(null, "Você dormiu por algumas horas. \n[Fome+1] [Sede+1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.setDia(this.getDia()+1);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        verificarMorte();
        if (this.getFome() == 0) {
            JOptionPane.showMessageDialog(null, "Você não está com fome", "Mensagem", JOptionPane.ERROR_MESSAGE);
        } else if (this.getEstoqueDeComida() > 0) {
            this.setFome(this.getFome() - 1);
            this.setEstoqueDeComida(this.getEstoqueDeComida()-1);
            JOptionPane.showMessageDialog(null, "Você procura algo na geladeira e escolhe comer um Pão com Manteiga. \n[Fome -1] [Estoque de Comida -1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(this.getEstoqueDeComida()<=0){
            JOptionPane.showMessageDialog(null, "Você procura algo na geladeira e não encontra nada. Tente comprar comida.", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        verificarMorte();
        if(this.getSede()==0){
            JOptionPane.showMessageDialog(null, "Você não está com sede", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        else{
            this.setSede(this.getSede()-1);
            JOptionPane.showMessageDialog(null, "Você pegou água do filtro e bebeu. \n[Sede -1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        verificarMorte();
        if("Programadora da Riot Games".equals(this.getTrabalho())){
            JOptionPane.showMessageDialog(null, "Você já trabalha na Riot Games. ", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        else if("Formado".equals(this.status)){
            Object selectedValue = JOptionPane.showInputDialog(null, "Escolha a sua área: ", "Opção",JOptionPane.INFORMATION_MESSAGE, null,itens2, itens2 [0]);
            input1String = (String) selectedValue;
            if(input1String.equalsIgnoreCase(this.getCurso())){
                JOptionPane.showMessageDialog(null, "Você foi contratado. ", "Parabéns", JOptionPane.INFORMATION_MESSAGE);
                this.setDinheiro(this.getDinheiro()+5);

                if(null != getCurso())switch (getCurso()) {
                    case "Sistema de Informação":
                    this.setTrabalho("Programadora da Riot");
                    break;
                    case "Desing":
                    this.setTrabalho("Design da Riot");
                    break;
                    case "Engenharia da Computação":
                    this.setTrabalho("Engenheiro da Riot");
                    break;
                    default:
                    break;
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Você não pode concorrer a vaga nessa área. ", "Mensagem", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Você não tem qualificação profissional para esse emprego. ", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }

        atualizarJanela();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        verificarMorte();
        if("Caixa do Supermercado".equals(this.getTrabalho())){
            JOptionPane.showMessageDialog(null, "Você já trabalha no Supermercado Tá Barato. ", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        else if (this.getExperiencia()>=5){
            JOptionPane.showMessageDialog(null, "O supermercado te contrata e te oferece um salário mediano.\n[Dinheiro+3]",  "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.setDinheiro(this.getDinheiro()+3);
            this.setTrabalho("Caixa do Supermercado");
            this.setExperiencia(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Parece que você ainda não é inteligente o suficiente para trabalhar no Supermercado Tá Barato", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        verificarMorte();
        if("Lavador de Carros".equals(this.getTrabalho())){

            JOptionPane.showMessageDialog(null, "Você já trabalha na Mecânica do Luiz. ", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        else if (this.getExperiencia()>=5){
            JOptionPane.showMessageDialog(null, "Luiz te chama pra trabalhar com ele e te dá um pequeno salário.\n[Dinheiro+2]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.setDinheiro(this.getDinheiro()+2);
            this.setTrabalho("Lavador de Carros");
            this.setExperiencia(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Parece que você ainda não é inteligente o suficiente para trabalhar na Mecânica do Luiz", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        verificarMorte();
        if("Ajudante do Seu Zé".equals(this.getTrabalho())){
            JOptionPane.showMessageDialog(null, "Você já trabalha na lanchonete do Seu Zé. ", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Você ajuda na lanchonte do Seu Zé e ele te dá um dinheirinho.\n [Dinheiro+1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.setTrabalho("Ajudante do Seu Zé");
            this.setDinheiro(this.getDinheiro()+1);
            this.setExperiencia(this.getExperiencia()+1);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        verificarMorte();
        if(getCurso().equals("Nenhum")){
            JOptionPane.showMessageDialog(null, "Você não está estudando, e por isso não pode fazer estágio.", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        else if(getPeriodoNum()>=3){
            JOptionPane.showMessageDialog(null, "Você recebe uma oferta de estágio e é contratado.\n[Dinheiro+4]", "Parabéns", JOptionPane.INFORMATION_MESSAGE);
            this.setDinheiro(this.getDinheiro()+4);
            this.setTrabalho("Estagiária");

        }
        else{
            JOptionPane.showMessageDialog(null, "Você ainda não tem conhecimentos suficientes pra essa vaga.", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        verificarMorte();
        if(null != this.getTrabalho())switch (this.getTrabalho()) {
            case "Nenhum":
            verificarMorte();
            JOptionPane.showMessageDialog(null, "Você não tem um trabalho!", "Mensagem", JOptionPane.ERROR_MESSAGE);
            break;
            case "Ajudante do Seu Zé":
            verificarMorte();
            TedioProgressBar.setValue(TedioProgressBar.getValue()+20);
            JOptionPane.showMessageDialog(null, "Você ajuda na lanchonte do Seu Zé e ele te dá um dinheirinho.\n [Dinheiro+1] [Fome+1] [Sede+1] [Energia-1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.setDinheiro(this.getDinheiro()+1);
            this.setFome(this.getFome()+1);
            this.setSede(this.getSede()+1);
            this.setEnergia(this.getEnergia()-1);
            this.setExperiencia(this.getExperiencia()+1);
            break;
            case "Lavador de Carros":
            verificarMorte();
            TedioProgressBar.setValue(TedioProgressBar.getValue()+20);
            JOptionPane.showMessageDialog(null, "Você lava alguns carros e Luis te paga.\n [Dinheiro+2] [Fome+1] [Sede+1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.setDinheiro(this.getDinheiro() + 2);
            this.setFome(this.getFome() + 1);
            this.setSede(this.getSede() + 1);
            this.setEnergia(this.getEnergia()-1);
            this.setExperiencia(this.getExperiencia()+1);
            break;
            case "Caixa do Supermercado":
            verificarMorte();
            TedioProgressBar.setValue(TedioProgressBar.getValue()+20);
            JOptionPane.showMessageDialog(null, "Você passa um longo dia trabalhando e recebe seu pagamento.\n [Dinheiro+3] [Fome+1] [Sede+1] [Energia-1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.setDinheiro(this.getDinheiro()+3);
            this.setFome(this.getFome()+1);
            this.setSede(this.getSede()+1);
            this.setEnergia(this.getEnergia()-1);
            this.setExperiencia(this.getExperiencia()+1);
            break;
            case "Programadora da Riot Games":
            verificarMorte();
            TedioProgressBar.setValue(TedioProgressBar.getValue()+20);
            JOptionPane.showMessageDialog(null, "Você passa um longo dia trabalhando e recebe seu pagamento.\n [Dinheiro+6] [Fome+1] [Sede+1] [Energia-1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.setDinheiro(this.getDinheiro()+6);
            this.setFome(this.getFome()+1);
            this.setSede(this.getSede()+1);
            this.setEnergia(this.getEnergia()-1);
            this.setExperiencia(this.getExperiencia()+1);
            break;
            case "Engenheiro da Riot Games":
            verificarMorte();
            TedioProgressBar.setValue(TedioProgressBar.getValue()+20);
            JOptionPane.showMessageDialog(null, "Você passa um longo dia trabalhando e recebe seu pagamento.\n [Dinheiro+6] [Fome+1] [Sede+1] [Energia-1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.setDinheiro(this.getDinheiro()+6);
            this.setFome(this.getFome()+1);
            this.setSede(this.getSede()+1);
            this.setEnergia(this.getEnergia()-1);
            this.setExperiencia(this.getExperiencia()+1);
            break;
            case "Design de Jogos da Riot Games":
            verificarMorte();
            TedioProgressBar.setValue(TedioProgressBar.getValue()+20);
            JOptionPane.showMessageDialog(null, "Você passa um longo dia trabalhando e recebe seu pagamento.\n [Dinheiro+6] [Fome+1] [Sede+1] [Energia-1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.setDinheiro(this.getDinheiro()+6);
            this.setFome(this.getFome()+1);
            this.setSede(this.getSede()+1);
            this.setEnergia(this.getEnergia()-1);
            this.setExperiencia(this.getExperiencia()+1);
            break;
            case "Streamer de Lol":
            verificarMorte();
            TedioProgressBar.setValue(TedioProgressBar.getValue()+20);
            FamaProgressBar.setValue(FamaProgressBar.getValue()+2);
            JOptionPane.showMessageDialog(null, "Você passa um longo dia streamando e recebe seu pagamento.\n[Fama+2] [Dinheiro+4] [Fome+1] [Sede+1] [Energia-1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.setDinheiro(this.getDinheiro()+4);
            this.setFome(this.getFome()+1);
            this.setSede(this.getSede()+1);
            this.setEnergia(this.getEnergia()-1);
            this.setExperiencia(this.getExperiencia()+1);
            break;

            case "Estagiária":
            verificarMorte();
            TedioProgressBar.setValue(TedioProgressBar.getValue()+20);
            JOptionPane.showMessageDialog(null, "Você passa um longo dia no Estágio e recebe seu pagamento.\n[Dinheiro+4] [Fome+1] [Sede+1] [Energia-1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.setDinheiro(this.getDinheiro()+4);
            this.setFome(this.getFome()+1);
            this.setSede(this.getSede()+1);
            this.setEnergia(this.getEnergia()-1);
            default:
            break;
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        verificarMorte();

        if(this.getDinheiro()==0){
            JOptionPane.showMessageDialog(null, "Não é possível comprar comida, você está pobre assim como a criadora do jogo", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        else if(this.getEstoqueDeComida()>=20){
            JOptionPane.showMessageDialog(null, "Não cabe mais comida na sua geladeira", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Você foi ao supermercado e comprou comida.\n[Estoque+1] [Dinheiro-1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.setEstoqueDeComida(this.getEstoqueDeComida()+1);
            this.setDinheiro(this.getDinheiro()-1);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        verificarMorte();
        if(getDinheiro()>=2){
            JOptionPane.showMessageDialog(null, "Você compra um delicioso sanduíche de mortadela. \n[Dinheiro-2] [Fome-1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            setDinheiro(getDinheiro()-2);
            setFome(getFome()-1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Não é possível comprar um sanduíche, você está pobre assim como a criadora do jogo", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        verificarMorte();
        count++;

        if(count>=3 && count<5){
            precoLeite = 3f;
            JOptionPane.showMessageDialog(null, "Você pergunta o preço do leite e a atendente te informa que é " + precoLeite + "R$", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(count>=5){
            precoLeite = 4.75f;
            JOptionPane.showMessageDialog(null, "Você pergunta o preço do leite e a atendente te informa que é " + precoLeite + "R$", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(count<3){
            JOptionPane.showMessageDialog(null, "Você pergunta o preço do leite e a atendente te informa que é " + precoLeite + "R$", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        verificarMorte();
        JOptionPane.showMessageDialog(null, "Você malhou por 1h, mas o monstro ainda não saiu da jaula.\n[Força+10] [Fome+1] [Sede+1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        ForcaProgressBar.setValue(ForcaProgressBar.getValue()+10);
        this.setFome(this.getFome()+1);
        this.setSede(this.getSede()+1);
        this.setEnergia(this.getEnergia()-1);
        atualizarJanela();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        verificarMorte();
        if(getDinheiro()<2){
            JOptionPane.showMessageDialog(null, "Não é possível comprar Whey, você está pobre assim como a criadora do jogo", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Você tomou Whey, mas o monstro ainda não saiu da jaula.\n[Força+5] [Dinheiro-2]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            ForcaProgressBar.setValue(ForcaProgressBar.getValue()+5);
            setDinheiro(getDinheiro()-2);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        verificarMorte();
        if("Namorando".equals(getStatusS())){
            JOptionPane.showMessageDialog(null, "Não é legal cantar outros garotos enquanto namora.\n[Relacionamento-10]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            MarceleProgressBar.setValue(MarceleProgressBar.getValue()-10);

            if(MarceleProgressBar.getValue()==0){
                JOptionPane.showMessageDialog(null, "Bruno terminou com você.\nTururu", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                this.setStatusS("Solteira");
                this.setNamorada(false);
                this.setNamorada1(null);
            }
        }
        else if(ForcaProgressBar.getValue()< 50){
            JOptionPane.showMessageDialog(null, "Os garotinhos riram da sua cantada, você fracassou.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(ForcaProgressBar.getValue()<80 && ForcaProgressBar.getValue()>= 50)
        {
            JOptionPane.showMessageDialog(null, "Os garotinhos te deram bola, você é sinistra.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            int resposta = JOptionPane.showConfirmDialog(null,"Um garoto da academia te chama pra sair.\n Aceita?","Mensagem",JOptionPane.YES_NO_OPTION);

            if(resposta == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Vocês passam uma ótima noite juntos.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                jPanel24.setVisible(true);
            }
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        verificarMorte();
        Object selectedValue = JOptionPane.showInputDialog(null, "Escolha a uma cantada: ", "Opção",JOptionPane.INFORMATION_MESSAGE, null,itens3, itens3 [0]);
        input1String = (String) selectedValue;
        if(MarceleProgressBar.getValue()<100){
            if(input1String.equalsIgnoreCase("Vem sempre aqui?")){
                JOptionPane.showMessageDialog(null, "Ele te responde que só vem quando você não está.\nNão desista", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(input1String.equalsIgnoreCase("Você é o ovo que falta na minha marmita")){
                JOptionPane.showMessageDialog(null, "Ele ri e começa a te dar bola.\n[Relacionamento+10]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                MarceleProgressBar.setValue(MarceleProgressBar.getValue()+10);
            }
            else if(input1String.equalsIgnoreCase("Eu não sou corona, mas você quer ter um caso confirmado comigo?")){
                JOptionPane.showMessageDialog(null, "Ele ri e diz que gostou da ideia.\n[Relacionamento+20]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                MarceleProgressBar.setValue(MarceleProgressBar.getValue()+20);
            }
            else if(input1String.equalsIgnoreCase("Papo de urubu, pena de galinha, se você vai me dar um fora, dê uma risadinha")){
                JOptionPane.showMessageDialog(null, "Ele fica séria e diz que não vai te dar um fora.\n[Relacionamento+20]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                MarceleProgressBar.setValue(MarceleProgressBar.getValue()+20);
            }
        }
        else{
            if("Solteira".equals(getStatusS())){
                int resposta1 = JOptionPane.showConfirmDialog(null,"As cantadas dão certo e surge uma oportunidade.\n Pedir Bruno em namoro?","Mensagem",JOptionPane.YES_NO_OPTION);
                if(resposta1 == JOptionPane.YES_OPTION){
                    this.setStatusS("Namorando");
                    this.setNamorada(true);
                    this.setNamorada1("Bruno");
                }
            }
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        verificarMorte();
        if(MarceleProgressBar.getValue()>=70){
            JOptionPane.showMessageDialog(null, "Vocês tem um bom momento.\n[Relacionamento+20]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            MarceleProgressBar.setValue(MarceleProgressBar.getValue()+20);
        }
        else if(MarceleProgressBar.getValue()<70) {
            JOptionPane.showMessageDialog(null, "Vocês não tem um relacionamento suficiente pra isso.", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        else if(MarceleProgressBar.getValue()==100){
            if("Solteira".equals(getStatusS())){
                int resposta1 = JOptionPane.showConfirmDialog(null,"As cantadas dão certo e surge uma oportunidade.\n Pedir Bruno em namoro?","Mensagem",JOptionPane.YES_NO_OPTION);
                if(resposta1 == JOptionPane.YES_OPTION){
                    this.setStatusS("Namorando");
                    this.setNamorada(true);
                    this.setNamorada1("Bruno");
                }
            }
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        verificarMorte();

        if("Desconhecido".equals(this.status)){
            int resposta = JOptionPane.showConfirmDialog(null,"Deseja se matricular em uma faculdade?","Matrícula",JOptionPane.YES_NO_OPTION);

            if(resposta==JOptionPane.YES_OPTION){
                Object selectedValue = JOptionPane.showInputDialog(null, "Escolha: ", "Opção",JOptionPane.INFORMATION_MESSAGE, null,itens2, itens2 [0]);
                input1String = (String) selectedValue;
                this.setStatus("Cursando");
                this.setPeriodoNum(1);
                this.setPeriodo(getPeriodoNum()+ "/8");

                if(input1String.equalsIgnoreCase("Sistemas de informação")){
                    this.setCurso("Sistemas de Informação");
                }
                else if(input1String.equalsIgnoreCase("Engenharia da Computação")){
                    this.setCurso("Engenharia da Computação");
                }
                else if(input1String.equalsIgnoreCase("Design de Jogos")){
                    this.setCurso("Design de Jogos");
                }
                jButton25.setVisible(false);
                jPanel3.setVisible(true);
                jPanel14.setVisible(true);
                jPanel18.setVisible(true);
            }
        }

        atualizarJanela();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        verificarMorte();

        if(ProgressoProgressBar.getValue() < 100){
            JOptionPane.showMessageDialog(null, "Você passou um bom tempo estudando. \n[Progresso do Período+20] [Tédio+10] [Fome+1] [Sede+1] [Energia-1]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.setEnergia(this.getEnergia()-1);
            ProgressoProgressBar.setValue(ProgressoProgressBar.getValue()+20);
            this.setFome(this.getFome()+1);
            this.setSede(this.getSede()+1);
            TedioProgressBar.setValue(TedioProgressBar.getValue()+10);
        }
        else if(getPeriodoNum()<8 && ProgressoProgressBar.getValue()==100)
        {
            JOptionPane.showMessageDialog(null, "Você passou de período. \n[Tédio+10] [Fome+1] [Sede+1] [Energia-1]", "Parabéns!", JOptionPane.INFORMATION_MESSAGE);
            TedioProgressBar.setValue(TedioProgressBar.getValue()+10);
            this.setEnergia(this.getEnergia()-1);
            this.setFome(this.getFome()+1);
            this.setSede(this.getSede()+1);
            setPeriodoNum(getPeriodoNum()+1);
            ProgressoProgressBar.setValue(0);

            if(getPeriodoNum() == 8){
                jButton7.setText("Fazer o TCC");
                jLabel5.setText("Progresso do TCC");
            }

        }
        if(ProgressoProgressBar.getValue() == 100 && getPeriodoNum() == 8){
            JOptionPane.showMessageDialog(null, "Você se formou. \n", "Parabéns!", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Você recebe a notícia que a Riot está contratando pessoas da sua área. \n", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            jLabel8.setVisible(true);
            this.setStatus("Formado");
        }

        atualizarJanela();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        verificarMorte();
        JOptionPane.showMessageDialog(null, "Você jogou um RPG com a galera e ficou um pouco conhecido.\n[Fama+5][Progresso do Período-5]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        FamaProgressBar.setValue(FamaProgressBar.getValue()+5);
        ProgressoProgressBar.setValue(ProgressoProgressBar.getValue()-5);
        atualizarJanela();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        verificarMorte();
        if(FamaProgressBar.getValue()<50){
            JOptionPane.showMessageDialog(null, "Você tocou vioão pra a galera e ficou um pouco conhecido.\n[Fama+5][Progresso do Período-5]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            FamaProgressBar.setValue(FamaProgressBar.getValue()+5);
            ProgressoProgressBar.setValue(ProgressoProgressBar.getValue()-5);
        }
        else{
            JOptionPane.showMessageDialog(null, "Você tocou vioão pra a galera e o pessoal adorou.\n[Fama+10][Progresso do Período-5]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            FamaProgressBar.setValue(FamaProgressBar.getValue()+10);
            ProgressoProgressBar.setValue(ProgressoProgressBar.getValue()-5);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed

        verificarMorte();
        if(FamaProgressBar.getValue()<50){
            JOptionPane.showMessageDialog(null, "Você jogou bola com a galera e ficou um pouco conhecido.\n[Fama+5][Progresso do Período-5]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            FamaProgressBar.setValue(FamaProgressBar.getValue()+5);
            ProgressoProgressBar.setValue(ProgressoProgressBar.getValue()-5);
        }
        else{
            JOptionPane.showMessageDialog(null, "Você jogou bola com a galera e arrebentou.\n[Fama+10][Progresso do Período-5]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            FamaProgressBar.setValue(FamaProgressBar.getValue()+10);
            ProgressoProgressBar.setValue(ProgressoProgressBar.getValue()-5);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        verificarMorte();
        if(!isAtletica()){
            if(FamaProgressBar.getValue()>=50){
                int resposta = JOptionPane.showConfirmDialog(null,"A galera vê que você é sinistra e te chama pra participar da Atlética.\n Aceita?","Mensagem",JOptionPane.YES_NO_OPTION);

                if(resposta == JOptionPane.YES_OPTION){
                    if("Namorando".equals(getStatusS())){
                        JOptionPane.showMessageDialog(null, "Não é legal cantar outros garotos enquanto namora.\n[Relacionamento-10]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                        MarceleProgressBar.setValue(MarceleProgressBar.getValue()-10);

                        if(MarceleProgressBar.getValue()==0){
                            JOptionPane.showMessageDialog(null, "Bruno terminou com você.\nTururu", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                            this.setStatusS("Solteiro");
                            this.setNamorada(false);
                            this.setNamorada1(null);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Os garotinhos te deram bola, você é sinistra.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Você não faz parte da atlética, tente ficar famosa.", "Mensagem", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(isAtletica() && FamaProgressBar.getValue()>=50){
            if("Namorando".equals(getStatusS())){
                JOptionPane.showMessageDialog(null, "Não é legal cantar outros garotos enquanto namora.\n[Relacionamento-10]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                MarceleProgressBar.setValue(MarceleProgressBar.getValue()-10);

                if(MarceleProgressBar.getValue()==0){
                    JOptionPane.showMessageDialog(null, "Bruno terminou com você.\nTururu", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    this.setStatusS("Solteiro");
                    this.setNamorada(false);
                    this.setNamorada1(null);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Os garotinhos te deram bola, você é sinistra.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }

        }
        else if(isAtletica() && FamaProgressBar.getValue()<50){
            JOptionPane.showMessageDialog(null, "Você não tem fama suficiente pra isso.", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        if(!isAtletica()){
            if(FamaProgressBar.getValue()>=20){
                int resposta = JOptionPane.showConfirmDialog(null,"A galera vê que você é um cara legal e te chama pra participar da Atlética.\n Aceita?","Mensagem",JOptionPane.YES_NO_OPTION);

                if(resposta == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "Você vai na festa da Atlética e fica famoso por dançar mal. \n [Fama+10] [Tédio-10]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    FamaProgressBar.setValue(FamaProgressBar.getValue()+10);
                    TedioProgressBar.setValue(TedioProgressBar.getValue()-10);
                    setAtletica(true);
                }

            }
            else{
                JOptionPane.showMessageDialog(null, "Você não faz parte da atlética, tente ficar famoso.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(isAtletica()&&FamaProgressBar.getValue()>=20){
            JOptionPane.showMessageDialog(null, "Você vai na festa da Atlética e fica famoso por dançar mal. \n [Fama+10] [Tédio-10]", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            FamaProgressBar.setValue(FamaProgressBar.getValue()+10);
            TedioProgressBar.setValue(TedioProgressBar.getValue()-10);
        }
        else if(isAtletica()&&FamaProgressBar.getValue()<20){
            JOptionPane.showMessageDialog(null, "Você não tem fama suficiente para ir na festa da Atlética.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        verificarMorte();
        if(!isAtletica()){
            if(FamaProgressBar.getValue()>=20){
                int resposta = JOptionPane.showConfirmDialog(null,"A galera vê que você é sinistra e te chama pra participar da Atlética.\n Aceita?","Mensagem",JOptionPane.YES_NO_OPTION);

                if(resposta == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "Você virou uma garota de Atlética. \n [Fama+10]", "Prabéns", JOptionPane.INFORMATION_MESSAGE);
                    FamaProgressBar.setValue(FamaProgressBar.getValue()+10);
                    setAtletica(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Você não tem fama suficiente para ser uma garota da atlética.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Você já faz parte da Atlética.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        verificarMorte();
        if(!isAtletica()){
            JOptionPane.showMessageDialog(null, "Você não faz parte da atlética.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else if(FamaProgressBar.getValue()>=80){
            int resposta = JOptionPane.showConfirmDialog(null,"Te chamam pro cargo de Presidente da Atlética.\nAceita?", "Mensagem",JOptionPane.YES_NO_OPTION);

            if(resposta == JOptionPane.YES_OPTION){
                setPresidente(true);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Você não tem fama suficiente pra se tornar a Presidenta da Atlética.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        atualizarJanela();
    }//GEN-LAST:event_jButton27ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FemFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CursoLabel;
    private javax.swing.JLabel DiaLabel;
    private javax.swing.JLabel DinheiroLabel;
    private javax.swing.JLabel DoguinhoLabel;
    private javax.swing.JLabel EnergiaLabel;
    private javax.swing.JLabel EstoqueLabel;
    private javax.swing.JProgressBar FamaProgressBar;
    private javax.swing.JLabel FomeLabel;
    private javax.swing.JProgressBar ForcaProgressBar;
    private javax.swing.JLabel GeneroLabel;
    private javax.swing.JPanel InformationLabel;
    private javax.swing.JProgressBar MarceleProgressBar;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PeriodoLabel;
    private javax.swing.JProgressBar ProgressoProgressBar;
    private javax.swing.JLabel SedeLabel;
    private javax.swing.JLabel Status2Label;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JProgressBar TedioProgressBar;
    private javax.swing.JLabel TrabalhoLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabe26;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

}
