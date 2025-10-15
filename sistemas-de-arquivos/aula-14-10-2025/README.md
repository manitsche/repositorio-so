# Sistemas de arquivos - Sistemas operacionais - Aula 14/10/2025

### Limitações da Memória de Processos
- Cada processo possui seu próprio espaço de memória, que é **limitado e temporário**.  
- Ao encerrar, os dados são **perdidos**.  
- É necessário um meio de armazenamento **persistente**.  
- Dados podem precisar ser **compartilhados** entre múltiplos processos.  
- Processos **não acessam memória alheia** diretamente.

---

### Requisitos para Armazenamento de Longo Prazo
Para que dados e informações possam ser preservados, o armazenamento de longo prazo deve:
- Permitir **armazenar grandes volumes** de dados.  
- **Manter os dados** mesmo após o encerramento do processo.  
- Permitir **acesso concorrente** por múltiplos processos.

---

### Sistema de Arquivos
O **Sistema de Arquivos**, parte essencial do **Sistema Operacional**, é responsável pela:
- **Gerência de dados e informações** a longo prazo.  
- Definição de **estrutura e organização** dos arquivos.  
- **Atribuição de nomes**, controle de **acesso** e **permissões**.  

> É um dos componentes mais utilizados pelos usuários, junto com a interface (CLI ou GUI).

---

### Hardware de Armazenamento

#### 🔹 Curto Prazo (alto desempenho)
- Registradores  
- Memória Cache  
- Memória DRAM  

### 🔹 Longo Prazo (baixo desempenho)
- Memórias de Estado Sólido (SSDs, Pen Drives)  
- Discos Rígidos (HDDs)  
- Discos Ópticos (CDs, DVDs, BDs)  
- Fitas Magnéticas  

---

### Abstração do Armazenamento
Os dispositivos de armazenamento podem ser representados de forma abstrata como:

> “Sequências lineares de blocos de dados de tamanho fixo”

Operações fundamentais:
- **Ler bloco k**  
- **Escrever no bloco k**

---

### Desafios de Gerenciamento
Questões essenciais para o sistema de arquivos:
- **Localização:** como encontrar as informações (quais blocos contêm os dados).  
- **Proteção:** como impedir acesso não autorizado a blocos restritos.  
- **Gerência de espaço:** como identificar blocos livres para gravar novos dados sem sobrescrever informações importantes.

---
  
O sistema de arquivos é o elo entre o hardware de armazenamento e os processos, garantindo **persistência, organização e segurança** dos dados.