class Blog {
    private Set<Post> postagens;

    public Blog() {
        this.postagens = new HashSet<>();
    }

    public void adicionarPostagem(Post postagem) {
        if (!postagens.add(postagem)) {
            throw new IllegalArgumentException("Postagem jah existente");
        }
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post post : postagens) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new HashMap<>();
        for (Post post : postagens) {
            contagem.put(post.getCategoria(), contagem.getOrDefault(post.getCategoria(), 0) + 1);
        }
        return contagem;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> posts = new TreeSet<>();
        for (Post post : postagens) {
            if (post.getAutor().equals(autor)) {
                posts.add(post);
            }
        }
        return posts;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> posts = new TreeSet<>();
        for (Post post : postagens) {
            if (post.getCategoria() == categoria) {
                posts.add(post);
            }
        }
        return posts;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> postsPorCategoria = new HashMap<>();
        for (Post post : postagens) {
            postsPorCategoria.putIfAbsent(post.getCategoria(), new TreeSet<>());
            postsPorCategoria.get(post.getCategoria()).add(post);
        }
        return postsPorCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> postsPorAutor = new HashMap<>();
        for (Post post : postagens) {
            postsPorAutor.putIfAbsent(post.getAutor(), new TreeSet<>());
            postsPorAutor.get(post.getAutor()).add(post);
        }
        return postsPorAutor;
    }
}
