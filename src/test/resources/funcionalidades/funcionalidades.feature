Feature: Funcionalidades


  Scenario Outline: Login com sucesso
    Given inserir usuario "<USUARIO>" na tela 'Login'
    And clicar no botao 'Entrar' na tela 'Login'
    And inserir senha "<SENHA>" na tela 'Login'
    When clicar no botao 'Entrar' na tela 'Login'
    Then devera ser direcionado para a pagina 'Home'

    Examples:
      | USUARIO        | SENHA        |
      | Willian_Juliao | cOntaMant01% |

  Scenario Outline: Criar tarefa
    And clicar no botao 'Criar tarefa' na tela 'Home'
    And seleciar o tipo de categoria 'Homologacao' na tela 'Criar Tarefa'
    And preencher campo 'Resumo' com o resumo da tarefa "<TITULO_PROBLEMA>" na tela 'Criar Tarefa'
    And preencher o campo 'Descricao' com a descricao "<DESCRICAO_PROBLEMA>" na tela 'Criar Tarefa'
    When clicar no botao 'Criar Nova Tarefa' na tela 'Criar Tarefa'
    And a tarefa devera ser adicionado com status 'Novo'


    Examples:
      | TITULO_PROBLEMA                                    | DESCRICAO_PROBLEMA                                                                                                                                                              |
      | Etapas divergentes entre aplicativos Edge e Chrome | Ao realizar log-in na plataforma, no navegador Microsoft Edge é apresentado um banner de boas-vindas. Já no navegador Google Chrome, o banner de boas-vindas não é apresentado. |

  Scenario Outline: Validar alteracao de senha
    And clicar no botao 'Perfil' no menu superior
    And clicar no botao 'Minha Conta' na tela 'Home'
    And preencher o campo 'Senha Atual' com a senha atual "<SENHA_ATUAL>" na tela 'Minha Conta'
    And preencher o campo 'Nova Senha' com a nova senha "<NOVA_SENHA>" na tela 'Minha Conta'
    And preencher o campo 'Confirmar Senha' com a nova senha "<NOVA_SENHA>" na tela 'Minha Conta'
    When clicar no botao 'Atualizar Usuário' na tela 'Minha Conta'
    And inserir usuario "<USUARIO>" na tela 'Login'
    And clicar no botao 'Entrar' na tela 'Login'
    And inserir a nova senha "<NOVA_SENHA>" na tela 'Login'
    When clicar no botao 'Entrar' na tela 'Login'
    Then devera ser direcionado para a pagina 'Home'

    Examples:
      | USUARIO        | SENHA_ATUAL  | NOVA_SENHA   |
      | Willian_Juliao | cOntaMant01% | cOntaMant02% |

  Scenario Outline: Validar alteracao de senha com senha invalida
    And clicar no botao 'Perfil' no menu superior
    And clicar no botao 'Minha Conta' na tela 'Home'
    And preencher o campo 'Senha Atual' com a senha invalida "<SENHA_INVALIDA>" na tela 'Minha Conta'
    And preencher o campo 'Nova Senha' com a nova senha "<NOVA_SENHA>" na tela 'Minha Conta'
    And preencher o campo 'Confirmar Senha' com a nova senha "<NOVA_SENHA>" na tela 'Minha Conta'
    When clicar no botao 'Atualizar Usuário' na tela 'Minha Conta'
    Then devera apresentar a mensagem 'A senha atual está incorreta' na tela 'Minha Conta'

    Examples:
      | SENHA_INVALIDA | NOVA_SENHA  |
      | senhaInvalid@1 | cOntaMant9$ |
#
  Scenario: Log-out com sucesso
    When clicar no botao 'Perfil' no menu superior
    And clicar no botao 'Sair'
    Then devera ser direcionado para a tela de log-in novamente

  Scenario Outline: Login com senha invalida
    Given inserir usuario "<USUARIO>" na tela 'Login'
    And clicar no botao 'Entrar' na tela 'Login'
    And inserir uma senha invalida "<SENHA>" na tela 'Login'
    When clicar no botao 'Entrar' na tela 'Login'
    Then devera ser apresentado uma mensagem informando que as credenciais estao invalidas na tela 'Login'

    Examples:
      | USUARIO        | SENHA         |
      | Willian_Juliao | cOntaMant111$ |


