output "instance_id" {
  description = "ID da instância EC2"
  value       = aws_instance.**********.*.id
}
 
output "instance_public_ip" {
  description = "IP público da instância EC2"
  value       = aws_instance.**********.*.public_ip
}
 
output "instance_public_dns" {
  description = "DNS público da instância EC2 "
  value       = aws_instance.**********.*.public_dns
}