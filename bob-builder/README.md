# Limitações

- Não trata todos os tipos de campo possíveis (ex.: BigDecimal, Date, etc.).
- Gera números negativos e positivos, enquanto o comentário sugere que deveria gerar apenas positivos.
- Não trata campos de tipos complexos ou personalizados.
- Não define valores para campos que não são tipos primitivos ou String.

## Melhoria

- expandir o suporte a mais tipos de dados, garantir que os números sejam positivos e adicionar tratamento para tipos
  complexos.