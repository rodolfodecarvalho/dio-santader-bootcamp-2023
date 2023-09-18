import { Language } from 'src/app/model/language';

export const dataMock: Language[] = [
  {
    id: '1',
    title: 'Java',
    description:
      'Java é uma linguagem de programação orientada a objetos desenvolvida na década de 90 por uma equipe de programadores chefiada por James Gosling, na empresa Sun Microsystems, que em 2008 foi adquirido pela empresa Oracle Corporation',
    photo: '../../assets/img/java.png',
  },
  {
    id: '2',
    title: 'Angular',
    description:
      'Angular é uma plataforma de aplicações web de código-fonte aberto e front-end baseado em TypeScript liderado pela Equipe Angular do Google e por uma comunidade de indivíduos e corporações. Angular é uma reescrita completa do AngularJS, feito pela mesma equipe que o construiu.',
    photo: '../../assets/img/angular.png',
  },
  {
    id: '3',
    title: 'Spring Boot',
    description:
      'O Spring Boot Extension é a solução de convenção sobre configuração do Spring para criar aplicativos Spring de nível de produção com quantidades mínimas de configuração.',
    photo: '../../assets/img/spring-boot.png',
  },
  {
    id: '4',
    title: 'Banco de dados',
    description:
      'Bancos de dados ou bases de dados são conjuntos de arquivos relacionados entre si, podendo conter registros sobre pessoas, lugares ou informações em geral. São coleções organizadas de dados que se relacionam ou não, de forma a armazenar',
    photo: '../../assets/img/data-base.png',
  },
];
