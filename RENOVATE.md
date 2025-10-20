# Renovate Bot Configuration

This repository uses Renovate Bot to automatically update dependencies. The configuration is defined in `renovate.json`.

## What Renovate Updates

- **Semaphore Version**: Monitors [semaphoreui/semaphore](https://github.com/semaphoreui/semaphore) releases and updates `ARG SEMAPHORE_VERSION` in the Dockerfile
- **Debian Base Image**: Monitors [hassio-addons/addon-debian-base](https://github.com/hassio-addons/addon-debian-base) releases and updates `ARG BUILD_FROM` in the Dockerfile

## Configuration Features

- **Automatic Merging**: Minor and patch updates are automatically merged
- **Major Version Protection**: Major versions require manual review
- **Grouped Updates**: Related dependencies are grouped together
- **Smart Scheduling**: Runs before 6 AM UTC on Mondays
- **Release Notes**: Automatically includes release notes in PRs

## Manual Trigger

You can manually trigger Renovate by:

1. Going to the Actions tab
2. Selecting "Renovate" workflow
3. Clicking "Run workflow"

## Setup Requirements

1. **GitHub App**: Install the [Renovate GitHub App](https://github.com/apps/renovate) on your repository, OR
2. **Self-hosted**: Use the included GitHub Actions workflow with a `RENOVATE_TOKEN`

## Benefits over Custom GitHub Actions

- ✅ **Battle-tested**: Used by thousands of repositories
- ✅ **Rich ecosystem**: Supports 100+ package managers
- ✅ **Smart conflict resolution**: Handles merge conflicts automatically
- ✅ **Dependency dashboard**: Visual overview of all updates
- ✅ **Security updates**: Prioritizes security patches
- ✅ **Vulnerability scanning**: Integration with security advisories
- ✅ **Flexible scheduling**: Advanced scheduling options
- ✅ **Grouping rules**: Intelligent grouping of related updates
