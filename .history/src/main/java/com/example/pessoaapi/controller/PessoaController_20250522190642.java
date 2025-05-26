@DeleteMapping("/{id}")
public void deletar(@PathVariable Long id) {
    pessoas.removeIf(p -> p.getId().equals(id));
}
